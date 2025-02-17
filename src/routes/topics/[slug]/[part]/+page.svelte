<script lang="ts">
    import { page } from '$app/state';
    import { goto } from '$app/navigation';
    import { topics } from '../../../../data/topics';

    const topic: number | null = topics[page.params.slug];
</script>

{#snippet partSelection(part: string)}
    <a class="!text-white grow flex justify-center pb-2 border-b-2 {page.params.part === part ? 'border-gray-300' : 'border-gray-500'} cursor-pointer capitalize" href="{part}">
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
    <h1 class="capitalize text-center py-10">{page.params.slug}</h1>
    <div class="flex flex-col gap-4 w-11/12 m-auto pb-2">
        <div class="flex w-11/12 m-auto">
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
    </div>
{/if}