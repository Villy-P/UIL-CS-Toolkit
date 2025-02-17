<script lang="ts">
	import SEO from './../../../../components/SEO.svelte';
    import { page } from '$app/state';
    import { topics } from '../../../../data/topics';
	import Markdown from '../../../../components/Markdown.svelte';
	import { onMount } from 'svelte';

    const topic: number | null = topics[page.params.slug];

    let textContent: undefined | string = $state(undefined);

    $effect(() => {
        fetch(`/${page.params.part}/${page.params.slug}.md`)
            .then(res => res.text())
            .then(text => textContent = text)
            .catch(err => console.error(err));
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
        <h1 class="text-6xl font-extrabold">404</h1>
        <p class="text-md">The topic you are looking for does not exist.</p>
        <a href="/topics">Go to Topics Page</a>
    </div>
{:else}
    {#if page.params.slug === 'bigo'}
        <h1 class="capitalize text-center py-10">BigO</h1>
    {:else}
        <h1 class="capitalize text-center py-10">{page.params.slug}</h1>
    {/if}
    <div class="flex flex-col gap-4 w-11/12 m-auto pb-2">
        <div class="flex w-full m-auto">
            {#if (topic & 100) === 100}
                {@render partSelection('cheatsheet')}
            {/if}
            {#if (topic & 10) === 10}
                {@render partSelection('guide')}
            {/if}
            {#if (topic & 1) === 1}
                {@render partSelection('questions')}
            {/if}
        </div>
        {#if textContent}
            <Markdown content={textContent}/>
        {/if}
    </div>
{/if}

<SEO title="{capitalize(page.params.slug)} - {capitalize(page.params.part)}"/>