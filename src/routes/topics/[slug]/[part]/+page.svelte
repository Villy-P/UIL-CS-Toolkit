<script lang="ts">
    import { page } from '$app/state';
    import { topics } from '../../../../data/topics';

    const topic: number | null = topics[page.params.slug];
</script>


{#if !topic}
    <div class="w-full min-h-[calc(100vh-120px)] flex items-center justify-center flex-col">
        <h1 class="text-6xl font-extrabold">404</h1>
        <p class="text-md">The topic you are looking for does not exist.</p>
        <a href="/topics">Go to Topics Page</a>
    </div>
{:else}    
    <div class="flex flex-col gap-4 pt-10 w-11/12 m-auto pb-2">

    </div>
{/if}