<script lang="ts">
	import SEO from './../../../../components/SEO.svelte';
    import { page } from '$app/state';
    import { topics, type TopicData } from '../../../../data/topics';
	import Markdown from '../../../../components/Markdown.svelte';
	import { onMount } from 'svelte';
	import type { Question } from '../../../../types/question';
	import QuestionContent from '../../../../components/QuestionContent.svelte';
	import { Button, Text } from '@valerius_petrini/corekit-ui';

    const topic = topics[page.params.slug];

    let textContent: undefined | string | Question[] = $state(undefined);

    $effect(() => {
        if (page.params.part !== "questions") {
            fetch(`/${page.params.part}/${page.params.slug}.md`)
                .then(res => res.text())
                .then(text => textContent = text)
                .catch(err => console.error(err));
        } else {
            fetch(`/${page.params.part}/${page.params.slug}.json`)
                .then(res => res.text())
                .then(text => textContent = text)
                .then(() => textContent = JSON.parse(textContent as string).questions)
                .catch(err => console.error(err));
        }
    });

    function capitalize(s: string) {
        return s.charAt(0).toUpperCase() + s.slice(1);
    }
</script>

{#snippet partSelection(part: string)}
    <a class="!text-white grow flex justify-center pb-2 border-b-2 
       {page.params.part === part ? 'border-gray-300' : 'border-gray-500'} 
       cursor-pointer capitalize" href="{part}">
        {part}
    </a>
{/snippet}

{#if !topic}
    <div class="w-full min-h-[calc(100vh-120px)] flex items-center justify-center flex-col">
        <Text tag="h1">404</Text>
        <Text>The topic you are looking for does not exist.</Text>
        <Button href="/topics" color="blue">
            Go to Topics Page
            <img src="/icons/right-arrow.svg" class="w-4 h-4 ml-2 mt-0.5" alt="Right Arrow"/>
        </Button>
    </div>
{:else}
    <Text tag="h1" class="capitalize text-center py-10">{topic.name}</Text>
    <div class="flex flex-col gap-4 w-11/12 m-auto pb-2">
        <div class="flex w-full m-auto">
            {#if topic.cheatsheet}
                {@render partSelection('cheatsheet')}
            {/if}
            {#if topic.guide}
                {@render partSelection('guide')}
            {/if}
            {#if topic.questions}
                {@render partSelection('questions')}
            {/if}
        </div>
        {#if textContent && typeof textContent === 'string'}
            <Markdown content={textContent}/>
        {:else if textContent && typeof textContent === 'object'}
            {#each textContent as question, index}
                <QuestionContent {question} {index}/>
            {/each}
        {/if}
    </div>
{/if}

<SEO title="{topic.name} - {capitalize(page.params.part)}"/>